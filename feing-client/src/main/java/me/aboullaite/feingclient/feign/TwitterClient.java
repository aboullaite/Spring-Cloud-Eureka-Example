package me.aboullaite.feingclient.feign;

import me.aboullaite.feingclient.domain.Tweet;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("twitter-service")
public interface TwitterClient {
    @RequestMapping(value = "/twitter/search/{hashtag}", method = RequestMethod.GET)
    List<Tweet> getTweets(@PathVariable("hashtag") String hashtag);
}
