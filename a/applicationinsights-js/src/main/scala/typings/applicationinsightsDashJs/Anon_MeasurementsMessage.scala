package typings.applicationinsightsDashJs

import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MeasurementsMessage extends js.Object {
  var measurements: FieldType
  var message: FieldType
  var properties: FieldType
  var severityLevel: FieldType
  var ver: FieldType
}

object Anon_MeasurementsMessage {
  @scala.inline
  def apply(
    measurements: FieldType,
    message: FieldType,
    properties: FieldType,
    severityLevel: FieldType,
    ver: FieldType
  ): Anon_MeasurementsMessage = {
    val __obj = js.Dynamic.literal(measurements = measurements.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MeasurementsMessage]
  }
}

