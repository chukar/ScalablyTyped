package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RateGroup extends js.Object {
  /**
    * A list of shipping labels defining the products to which this rate group
    * applies to. This is a disjunction: only one of the labels has to match
    * for the rate group to apply. May only be empty for the last rate group of
    * a service. Required.
    */
  var applicableShippingLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of carrier rates that can be referred to by mainTable or
    * singleValue.
    */
  var carrierRates: js.UndefOr[js.Array[Schema$CarrierRate]] = js.native
  /**
    * A table defining the rate group, when singleValue is not expressive
    * enough. Can only be set if singleValue is not set.
    */
  var mainTable: js.UndefOr[Schema$Table] = js.native
  /**
    * Name of the rate group. Optional. If set has to be unique within shipping
    * service.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the rate group (e.g. flat rate $10). Can only be set if
    * mainTable and subtables are not set.
    */
  var singleValue: js.UndefOr[Schema$Value] = js.native
  /**
    * A list of subtables referred to by mainTable. Can only be set if
    * mainTable is set.
    */
  var subtables: js.UndefOr[js.Array[Schema$Table]] = js.native
}

object Schema$RateGroup {
  @scala.inline
  def apply(
    applicableShippingLabels: js.Array[String] = null,
    carrierRates: js.Array[Schema$CarrierRate] = null,
    mainTable: Schema$Table = null,
    name: String = null,
    singleValue: Schema$Value = null,
    subtables: js.Array[Schema$Table] = null
  ): Schema$RateGroup = {
    val __obj = js.Dynamic.literal()
    if (applicableShippingLabels != null) __obj.updateDynamic("applicableShippingLabels")(applicableShippingLabels.asInstanceOf[js.Any])
    if (carrierRates != null) __obj.updateDynamic("carrierRates")(carrierRates.asInstanceOf[js.Any])
    if (mainTable != null) __obj.updateDynamic("mainTable")(mainTable.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (singleValue != null) __obj.updateDynamic("singleValue")(singleValue.asInstanceOf[js.Any])
    if (subtables != null) __obj.updateDynamic("subtables")(subtables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RateGroup]
  }
}

