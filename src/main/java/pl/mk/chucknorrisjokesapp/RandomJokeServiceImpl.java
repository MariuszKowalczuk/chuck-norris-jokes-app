package pl.mk.chucknorrisjokesapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author Mariusz Kowalczuk
 */
@Service
public class RandomJokeServiceImpl implements RandomJokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();


    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
