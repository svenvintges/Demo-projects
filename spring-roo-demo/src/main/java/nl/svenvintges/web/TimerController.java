package nl.svenvintges.web;

import nl.svenvintges.Timer;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "timers", formBackingObject = Timer.class)
@RequestMapping("/timers")
@Controller
public class TimerController {
}
