# NBA Matchup

A mobile application that will provide users with scores, stats and player information for the NBA.

By Edgar Hernandez Ortiz

## Installation

Download:

    $ git clone `https://github.com/Edgarcho/NBA-Matchup.git`

Import Project by Android Studio Menu > File > Import Project...

Before running the project, you will need a API Key from MySportsFeeds.

1.Create a MySportsFeeds account.

2.Open Postman. Change the Authorization type to Basic Auth.

    Enter your MySportsFeeds Username and Password.
    Click on preview request.
    Switch to Headers and copy the value provided.

3 Create a new file named gradle.properties.

    Copy and paste this inside the file
      `org.gradle.jvmargs=-Xmx1536m
       MySportsFeedToken = "API_KEY"`
    paste the value provided from Postman the API_KEY section



Run NBA Matchup by Android Studio Menu > Run > Run YourApp.

### Future additions

## Technologies Used
  * MySportsFeed API
  * Android Studio
    * ButterKnife
    * XML
    * Java
    * OkHttp
    * RecyclerView

## Support and contact details

_Email no one with any questions, comments, or concerns._

### License

*This software is licensed under the MIT license*

Copyright (c) 2018 **_Edgar Hernandez-Ortiz_**
