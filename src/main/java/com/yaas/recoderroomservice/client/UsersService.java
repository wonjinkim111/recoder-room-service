	package com.yaas.recoderroomservice.client;
	
	import com.yaas.recoderroomservice.model.UmentorNicknameModel;
	import org.springframework.cloud.openfeign.FeignClient;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	
	@FeignClient(
	        //url = "http://localhost:10000",
	        name = "users-service"
	)
	public interface UsersService {
	    @GetMapping({"/users/mentor/nickname"})
	    UmentorNicknameModel getMentorNickname(@RequestParam("mentorId") long mentorId);
	}
