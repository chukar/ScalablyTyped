package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/attributes relevant section in reference guide}
  */
@js.native
trait IAttribute
  extends IElement
     with IByNameReferrable {
  val containerAsEntity: IEntity = js.native
  @JSName("model")
  val model_IAttribute: IModel = js.native
  val name: String = js.native
  /**
    * This property is required and cannot be set to null.
    */
  val `type`: IAttributeType = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.6.0: added public
    */
  val value: IValueType = js.native
}

