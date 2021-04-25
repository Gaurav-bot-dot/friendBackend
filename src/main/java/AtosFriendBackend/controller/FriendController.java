package AtosFriendBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AtosFriendBackend.model.Friend;
import AtosFriendBackend.repository.FriendRepository;

@RestController
@RequestMapping("/api/v1/")
public class FriendController {

	@Autowired
	private FriendRepository friendRepository;


    //get all friends	
	@GetMapping ("/friends")
	public List<Friend> getAllFriends(){
		return friendRepository.findAll();
	}
}
