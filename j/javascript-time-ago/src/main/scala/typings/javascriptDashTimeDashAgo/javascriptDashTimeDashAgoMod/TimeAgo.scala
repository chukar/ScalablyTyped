package typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoMod

import typings.javascriptDashTimeDashAgo.localeMod.DefaultFormats
import typings.javascriptDashTimeDashAgo.localeMod.Duration
import typings.javascriptDashTimeDashAgo.localeMod.Formats
import typings.javascriptDashTimeDashAgo.localeMod.RTFFormatter
import typings.javascriptDashTimeDashAgo.localeMod.TimeUnit
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeAgo extends js.Object {
  def format(input: Double): String = js.native
  def format(input: Double, style: String): String = js.native
  def format(input: Date): String = js.native
  def format(input: Date, style: String): String = js.native
  def formatNumber(number: Double): String = js.native
  def formatValue(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
  def formatValue(value: Date, unit: TimeUnit, localeData: Duration): String = js.native
  def getFormatter(flavor: DefaultFormats): RTFFormatter = js.native
  def getLocaleData(): Duration = js.native
  def getLocaleData(format: Formats): Duration = js.native
  def getRule(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
   // Defaults to "long"
  def getRule(value: Date, unit: TimeUnit, localeData: Duration): String = js.native
}

