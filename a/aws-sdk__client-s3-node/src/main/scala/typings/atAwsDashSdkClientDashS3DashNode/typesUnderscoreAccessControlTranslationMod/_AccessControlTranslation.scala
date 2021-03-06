package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAccessControlTranslationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Destination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AccessControlTranslation extends js.Object {
  /**
    * <p>The override value for the owner of the replica object.</p>
    */
  var Owner: Destination | String
}

object _AccessControlTranslation {
  @scala.inline
  def apply(Owner: Destination | String): _AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_AccessControlTranslation]
  }
}

