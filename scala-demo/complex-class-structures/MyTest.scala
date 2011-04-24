//Author: Sven Vintges
//Extended version of the Scala Tutorial Derivation Example
//2011
abstract class Tree
case class Sum(l: Tree, r:Tree) extends Tree
case class Var(n:String) extends Tree
case class Const(v:Int) extends Tree
// only except natural numbers for the Pow function
case class Pow(t: Tree, t2:Int) extends Tree
case class Product(t: Tree, t2: Tree) extends Tree

object MyTest
{

	type Environment = String => Int

	def eval(t: Tree, env:Environment): Double = t match {
  		case Sum(l, r) => eval (l, env) + eval(r, env)
		case Pow(t, t2) => Math.pow(eval(t, env), t2)  
		case Product(t, t2) => eval(t, env) * eval(t2, env)
  		case Var(c) => env(c)
  		case Const(v) => v
		}

	def derive (t: Tree, v: String): Tree = t match {
	  case Sum(l,r) => Sum(derive(l, v), derive(r,v))
	  case Var(n) if (v == n) => Const(1)
          case Pow(t,t2) => Product(Pow(t,t2-1),Const(t2))
          case Product(t,t2) => Product(derive(t,v), derive(t2,v))
	  case _ => Const(0)
	}
	

	// I want to return a tree, because x^2 returns 2x and x^y return y*x^y-1 (if y is natural) 
	// but we want to perform the operations on al elements of Const(_)
	def simplify(t: Tree): Int  = t match {
		case Sum(l,r) => simplify(l) + simplify(r)
		//case Pow(b,e) => Pow(Const(simplify(b)), Const(simplify(e)))
  		//case Product(l,r) => Product(Const(simplify(l)), Const(simplify(r)))
		case Const(1) => 1
		case Const(0) => 0
	}

	def main (args: Array[String]) {
	  val exp: Tree = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
	  val env: Environment = {case "x" => 5 case "y" => 7}
	  println("Expression: " + exp)
	  println("Evaluation with x=5, y=7: " + eval(exp,env))
	  println("Derivative relative to x: \n" + derive(exp, "x"))
	  println("Simplified derivative to x: "+ simplify(derive(exp,"x")))
	  println("Derivative relative to y: \n" + derive(exp, "y"))
	  println("Simplified derivative to y: "+simplify(derive(exp, "y")))
	  println("------------------------------------------------------\n\n")
	  val exp2: Tree = Pow(Var("x"), 2)
	  println("Expression: " + exp2)
	  println("Evaluated with x=5, y=7: " + eval(exp2, env))
	  println("Derivative relative to x: \n " + derive(exp2, "x"))
	  //println("Simplified: " + simplify(derive(exp2, "x")))
	  println("Derivative relative to y: \n " + derive(exp2, "y"))
	  //println("Simplified: " + simplify(derive(exp2, "y")))
	}
}




