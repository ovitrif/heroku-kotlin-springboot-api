# A sample Spring Boot REST Api in Kotlin
[![Heroku](http://heroku-badge.herokuapp.com/?app=heroku-kotlin-springboot-api&style=flat&svg=1)](https://heroku-kotlin-springboot-api.herokuapp.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)][license-url]

Ready to be deployed to Heroku.

## ⏳ Prerequisites

1. Java - [How to Install JDK (on Windows, Mac OS & Ubuntu)](https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html).
2. The [Heroku CLI](https://cli.heroku.com/).

## 🎬 Running Locally
1. Clone this repository on your local machine.
2. In a terminal window, go to the root directory of the repo and run:
```sh
./gradlew build
heroku local:start
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

## ☁️ Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## 📜 License
Licensed with the [MIT License][license-url].

[license-url]: https://github.com/ovitrif/heroku-kotlin-springboot-api/blob/master/LICENSE
