package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.events.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.WebHooks")
@js.native
class WebHooks () extends js.Object {
  def constructEvent(requestBody: js.Any, signature: String, endpointSecret: String): IEvent = js.native
  def constructEvent(requestBody: js.Any, signature: String, endpointSecret: String, tolerance: Double): IEvent = js.native
  def constructEvent(requestBody: js.Any, signature: js.Array[String], endpointSecret: String): IEvent = js.native
  def constructEvent(requestBody: js.Any, signature: js.Array[String], endpointSecret: String, tolerance: Double): IEvent = js.native
  /**
    * Generates a header to be used for webhook mocking
    */
  def generateTestHeaderString(options: IWebHookGenerateTestHeaderStringOptions): String = js.native
}

