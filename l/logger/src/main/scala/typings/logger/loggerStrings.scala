package typings.logger

import typings.logger.loggerMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object loggerStrings {
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait fatal extends LogLevel
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait warn extends LogLevel
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

