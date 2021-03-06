package typings.awsDashSdk.clientsMobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * A collection of key-value pairs that give additional context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
    */
  var attributes: js.UndefOr[MapOfStringToString] = js.native
  /**
    * A name signifying an event that occurred in your app. This is used for grouping and aggregating like events together for reporting purposes.
    */
  var eventType: String50Chars = js.native
  /**
    * A collection of key-value pairs that gives additional, measurable context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
    */
  var metrics: js.UndefOr[MapOfStringToNumber] = js.native
  /**
    * The session the event occured within. 
    */
  var session: js.UndefOr[Session] = js.native
  /**
    * The time the event occurred in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var timestamp: ISO8601Timestamp = js.native
  /**
    * The version of the event.
    */
  var version: js.UndefOr[String10Chars] = js.native
}

object Event {
  @scala.inline
  def apply(
    eventType: String50Chars,
    timestamp: ISO8601Timestamp,
    attributes: MapOfStringToString = null,
    metrics: MapOfStringToNumber = null,
    session: Session = null,
    version: String10Chars = null
  ): Event = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

