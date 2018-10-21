# kotlin-getting-started

A barebones Kotlin app, which can easily be deployed to Heroku.

This application supports the [Getting Started with Kotlin on Heroku](https://devcenter.heroku.com/articles/getting-started-with-kotlin) article - check it out.

## Running Locally

Make sure you have Java installed.  Also, install the [Heroku CLI](https://cli.heroku.com/).

```sh
$ git clone https://github.com/heroku/kotlin-getting-started.git
$ cd kotlin-getting-started
gradle build
heroku local:start
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java and Kotlin on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)
