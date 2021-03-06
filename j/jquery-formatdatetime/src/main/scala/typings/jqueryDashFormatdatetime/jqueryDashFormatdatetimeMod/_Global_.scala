package typings.jqueryDashFormatdatetime.jqueryDashFormatdatetimeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait JQuery extends js.Object {
    def formatDateTime(format: String): JQuery = js.native
    def formatDateTime(format: String, options: Options): JQuery = js.native
  }
  
  @js.native
  trait JQueryStatic extends js.Object {
    def formatDateTime(format: String, date: Date): String = js.native
    def formatDateTime(format: String, date: Date, options: Options): String = js.native
  }
  
}

