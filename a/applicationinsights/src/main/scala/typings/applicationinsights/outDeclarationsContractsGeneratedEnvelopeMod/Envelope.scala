package typings.applicationinsights.outDeclarationsContractsGeneratedEnvelopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System variables for a telemetry item.
  */
trait Envelope extends js.Object {
  /**
    * Telemetry data item.
    */
  var data: typings.applicationinsights.outDeclarationsContractsGeneratedBaseMod.^
  /**
    * The application's instrumentation key. The key is typically represented as a GUID, but there are cases when it is not a guid. No code should rely on iKey being a GUID. Instrumentation key is case insensitive.
    */
  var iKey: String
  /**
    * Type name of telemetry data item.
    */
  var name: String
  /**
    * Sampling rate used in application. This telemetry item represents 1 / sampleRate actual telemetry items.
    */
  var sampleRate: Double
  /**
    * Sequence field used to track absolute order of uploaded events.
    */
  var seq: String
  /**
    * Key/value collection of context properties. See ContextTagKeys for information on available properties.
    */
  var tags: js.Any
  /**
    * Event date time when telemetry item was created. This is the wall clock time on the client when the event was generated. There is no guarantee that the client's time is accurate. This field must be formatted in UTC ISO 8601 format, with a trailing 'Z' character, as described publicly on https://en.wikipedia.org/wiki/ISO_8601#UTC. Note: the number of decimal seconds digits provided are variable (and unspecified). Consumers should handle this, i.e. managed code consumers should not use format 'O' for parsing as it specifies a fixed length. Example: 2009-06-15T13:45:30.0000000Z.
    */
  var time: String
  /**
    * Envelope version. For internal use only. By assigning this the default, it will not be serialized within the payload unless changed to a value other than #1.
    */
  var ver: Double
}

object Envelope {
  @scala.inline
  def apply(
    data: typings.applicationinsights.outDeclarationsContractsGeneratedBaseMod.^,
    iKey: String,
    name: String,
    sampleRate: Double,
    seq: String,
    tags: js.Any,
    time: String,
    ver: Double
  ): Envelope = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], iKey = iKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Envelope]
  }
}

