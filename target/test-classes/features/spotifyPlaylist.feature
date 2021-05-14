Feature: Spotify Playlist

	Background:
		Given user is logged in to spotify account
	
	Scenario:
		Create a playlist
		
		When user creates a playlist with name Saurabh Playlist
		Then Playlist is created successfully
		

	Scenario:
		Get all playlist
		
		When user request for all his playlist
		Then all playlist are listed 
		
	Scenario:
		Udate a playlist
		
		When user creates a playlist with name Saurabh Playlist
		And Playlist is created successfully
		And user updates the above playlist to name Saurabh Fav Playlist
		Then the playlist is updated 