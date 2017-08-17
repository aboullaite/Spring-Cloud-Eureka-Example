package io.aboullaite.eurekaclient.controller;

import io.aboullaite.eurekaclient.domain.Tweet;
import io.aboullaite.eurekaclient.exception.SomeException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/twitter")
public class TwitterController {
   Logger logger = LoggerFactory.getLogger(TwitterController.class);

    @RequestMapping(value = "/search/{hashtag}", method = RequestMethod.GET)
    public List<Tweet> searchOnTwitter(@PathVariable String hashtag){
        QueryResult result;
        try {
            Twitter twitter = TwitterFactory.getSingleton();
            Query query = new Query(hashtag);
             result = twitter.search(query);
             return result.getTweets().stream()
                     .map(status -> new Tweet(status.getText(), status.getUser().getName(),  status.getUser().getScreenName(), status.getUser().getOriginalProfileImageURL(), status.getFavoriteCount(), status.getRetweetCount()))
                     .collect(Collectors.toList());
        } catch (TwitterException e) {
            logger.error("Ooops", e);
            throw new SomeException();
        }
    }
}
