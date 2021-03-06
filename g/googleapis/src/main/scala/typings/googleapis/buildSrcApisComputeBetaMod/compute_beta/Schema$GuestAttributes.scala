package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A guest attributes entry.
  */
@js.native
trait Schema$GuestAttributes extends js.Object {
  /**
    * [Output Only] Type of the resource. Always compute#guestAttributes for
    * guest attributes entry.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The path to be queried. This can be the default namespace (&#39;/&#39;)
    * or a nested namespace (&#39;//&#39;) or a specified key (&#39;//&#39;)
    */
  var queryPath: js.UndefOr[String] = js.native
  /**
    * [Output Only] The value of the requested queried path.
    */
  var queryValue: js.UndefOr[Schema$GuestAttributesValue] = js.native
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The key to search for.
    */
  var variableKey: js.UndefOr[String] = js.native
  /**
    * [Output Only] The value found for the requested key.
    */
  var variableValue: js.UndefOr[String] = js.native
}

object Schema$GuestAttributes {
  @scala.inline
  def apply(
    kind: String = null,
    queryPath: String = null,
    queryValue: Schema$GuestAttributesValue = null,
    selfLink: String = null,
    variableKey: String = null,
    variableValue: String = null
  ): Schema$GuestAttributes = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (queryPath != null) __obj.updateDynamic("queryPath")(queryPath.asInstanceOf[js.Any])
    if (queryValue != null) __obj.updateDynamic("queryValue")(queryValue.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (variableKey != null) __obj.updateDynamic("variableKey")(variableKey.asInstanceOf[js.Any])
    if (variableValue != null) __obj.updateDynamic("variableValue")(variableValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GuestAttributes]
  }
}

