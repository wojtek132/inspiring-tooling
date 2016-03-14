package com.inspiringsolutions.tweet.core

import com.inspiringsolutions.tweet.services.{TwitterStreamProducerService, TwitterStreamProducerServiceImpl}
import play.api.inject.Module
import play.api.{Configuration, Environment}

/**
 * This class is a Guice module that tells Guice how to bind several
 * different types. This Guice module is created when the Play
 * application starts.
 *
 * Play will automatically use any class called `Module` that is in
 * the root package. You can create modules in other locations by
 * adding `play.modules.enabled` settings to the `application.conf`
 * configuration file.
 */
class ComponentModule extends Module {

  def bindings(env: Environment, conf: Configuration) = Seq(
    bind[TwitterStreamProducerService].to[TwitterStreamProducerServiceImpl]
  )

}
