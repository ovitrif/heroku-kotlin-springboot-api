A sample REST Api built with Spring Boot in Kotlin, which can easily be deployed to Heroku.

[![License](https://img.shields.io/badge/License-MIT-blue.svg)][license-url]

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
