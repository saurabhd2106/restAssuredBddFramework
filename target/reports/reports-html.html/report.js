$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/spotifyPlaylist.feature");
formatter.feature({
  "name": "Spotify Playlist",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged in to spotify account",
  "keyword": "Given "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.user_is_logged_in_to_spotify_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "\t\tCreate a playlist",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user creates a playlist with name Saurabh Playlist",
  "keyword": "When "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.user_creates_a_playlist_with_name_Saurabh_Playlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Playlist is created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.playlist_is_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged in to spotify account",
  "keyword": "Given "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.user_is_logged_in_to_spotify_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "\t\tGet all playlist",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user request for all his playlist",
  "keyword": "When "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.user_request_for_all_his_playlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all playlist are listed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.all_playlist_are_listed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged in to spotify account",
  "keyword": "Given "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.user_is_logged_in_to_spotify_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "\t\tUdate a playlist",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user creates a playlist with name Saurabh Playlist",
  "keyword": "When "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.user_creates_a_playlist_with_name_Saurabh_Playlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Playlist is created successfully",
  "keyword": "And "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.playlist_is_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user updates the above playlist to name Saurabh Fav Playlist",
  "keyword": "And "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.user_updates_the_above_playlist_to_name_Saurabh_Fav_Playlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the playlist is updated",
  "keyword": "Then "
});
formatter.match({
  "location": "com.spotify.stepDefinition.SpotifyPlaylistTestSteps.the_playlist_is_updated()"
});
formatter.result({
  "status": "passed"
});
});