package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly A representation of the status of an ad in a specific context.
  * A context here relates to where something ultimately serves (for example, a
  * user or publisher geo, a platform, an HTTPS vs HTTP request, or the type of
  * auction).
  */
@js.native
trait Schema$ServingRestriction extends js.Object {
  /**
    * The contexts for the restriction.
    */
  var contexts: js.UndefOr[js.Array[Schema$ServingContext]] = js.native
  /**
    * Disapproval bound to this restriction. Only present if
    * status=DISAPPROVED. Can be used to filter the response of the
    * creatives.list method.
    */
  var disapproval: js.UndefOr[Schema$Disapproval] = js.native
  /**
    * Any disapprovals bound to this restriction. Only present if
    * status=DISAPPROVED. Can be used to filter the response of the
    * creatives.list method. Deprecated; please use disapproval field instead.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Schema$Disapproval]] = js.native
  /**
    * The status of the creative in this context (for example, it has been
    * explicitly disapproved or is pending review).
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$ServingRestriction {
  @scala.inline
  def apply(
    contexts: js.Array[Schema$ServingContext] = null,
    disapproval: Schema$Disapproval = null,
    disapprovalReasons: js.Array[Schema$Disapproval] = null,
    status: String = null
  ): Schema$ServingRestriction = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (disapproval != null) __obj.updateDynamic("disapproval")(disapproval.asInstanceOf[js.Any])
    if (disapprovalReasons != null) __obj.updateDynamic("disapprovalReasons")(disapprovalReasons.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServingRestriction]
  }
}

