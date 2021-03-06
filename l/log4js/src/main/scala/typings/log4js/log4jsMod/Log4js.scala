package typings.log4js.log4jsMod

import typings.log4js.Anon_Format
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log4js extends js.Object {
  	// express.Handler;
  var levels: Levels = js.native
  def addLayout(
    name: String,
    config: js.Function1[/* a */ js.Any, js.Function1[/* logEvent */ LoggingEvent, String]]
  ): Unit = js.native
  def configure(config: Configuration): Log4js = js.native
  def configure(filename: String): Log4js = js.native
  def connectLogger(logger: Logger, options: Anon_Format): js.Any = js.native
  def getLogger(): Logger = js.native
  def getLogger(category: String): Logger = js.native
  def shutdown(cb: js.Function1[/* error */ Error, Unit]): Unit | Null = js.native
}

