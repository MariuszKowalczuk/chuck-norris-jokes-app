package pl.mk.chucknorrisjokesapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mariusz Kowalczuk
 */
@Controller
public class ChuckNorrisJokeController {

    private RandomJokeService randomJokeService;

    public ChuckNorrisJokeController(RandomJokeService randomJokeService) {
        this.randomJokeService = randomJokeService;
    }

    @RequestMapping(path = {"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", randomJokeService.getRandomJoke());
        return "chucknorris";
    }
}
