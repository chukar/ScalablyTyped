package typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.Netflix
  - typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.Amazon
  - typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.MyOwn
*/
trait DataCenterName extends js.Object

object DataCenterName {
  @scala.inline
  def Amazon: typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.Amazon = this.cast("Amazon")
  @scala.inline
  def MyOwn: typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.MyOwn = this.cast("MyOwn")
  @scala.inline
  def Netflix: typings.eurekaDashJsDashClient.eurekaDashJsDashClientStrings.Netflix = this.cast("Netflix")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

