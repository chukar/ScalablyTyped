package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import typings.gapiDotClientDotBigquery.Anon_Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameterType extends js.Object {
  /** [Optional] The type of the array's elements, if this is an array. */
  var arrayType: js.UndefOr[QueryParameterType] = js.undefined
  /** [Optional] The types of the fields of this struct, in order, if this is a struct. */
  var structTypes: js.UndefOr[js.Array[Anon_Description]] = js.undefined
  /** [Required] The top level type of this field. */
  var `type`: js.UndefOr[String] = js.undefined
}

object QueryParameterType {
  @scala.inline
  def apply(
    arrayType: QueryParameterType = null,
    structTypes: js.Array[Anon_Description] = null,
    `type`: String = null
  ): QueryParameterType = {
    val __obj = js.Dynamic.literal()
    if (arrayType != null) __obj.updateDynamic("arrayType")(arrayType.asInstanceOf[js.Any])
    if (structTypes != null) __obj.updateDynamic("structTypes")(structTypes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameterType]
  }
}

