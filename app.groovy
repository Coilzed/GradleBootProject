@RestController
class DefaultController {

    @RequestMapping("/")
    String defaultAction() {
        return "Default action"
    }
}