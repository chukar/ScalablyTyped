package typings.mendixmodelsdk.distGenSecurityMod.security

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
  */
@js.native
trait IUserRole
  extends IElement
     with IByNameReferrable {
  val containerAsProjectSecurity: IProjectSecurity = js.native
  @JSName("model")
  val model_IUserRole: IModel = js.native
  val name: String = js.native
}

