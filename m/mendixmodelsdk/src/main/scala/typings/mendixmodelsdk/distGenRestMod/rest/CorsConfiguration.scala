package typings.mendixmodelsdk.distGenRestMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/cors-settings relevant section in reference guide}
  *
  * In version 7.18.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.CorsConfiguration")
@js.native
class CorsConfiguration protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCorsConfiguration: IModel = js.native
  def allowAuthentication(): Boolean = js.native
  def allowAuthentication(newValue: Boolean): js.Any = js.native
  def allowedOrigins(): IConstant | Null = js.native
  def allowedOrigins(newValue: IConstant): js.Any = js.native
  def allowedOriginsQualifiedName(): String | Null = js.native
  @JSName("allowedOrigins")
  def allowedOrigins_Any(): js.Any = js.native
  def containerAsPublishedRestService(): PublishedRestService = js.native
  def maxAge(): IConstant | Null = js.native
  def maxAge(newValue: IConstant): js.Any = js.native
  def maxAgeQualifiedName(): String | Null = js.native
  @JSName("maxAge")
  def maxAge_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.CorsConfiguration")
@js.native
object CorsConfiguration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CorsConfiguration = js.native
  /**
    * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
    * The new CorsConfiguration will be automatically stored in the 'corsConfiguration' property
    * of the parent PublishedRestService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createIn(container: PublishedRestService): CorsConfiguration = js.native
}

