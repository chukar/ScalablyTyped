package typings.mendixmodelsdk.distGenAppservicesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd")
@js.native
class Msd protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMsd: IModel = js.native
  def containerAsConsumedAppService(): ConsumedAppService = js.native
  def domainModel(): MsdDomainModel = js.native
  def domainModel(newValue: MsdDomainModel): js.Any = js.native
  def enumerations(): MsdEnumerationContainer = js.native
  def enumerations(newValue: MsdEnumerationContainer): js.Any = js.native
  def metadata(): MsdMetadata = js.native
  def metadata(newValue: MsdMetadata): js.Any = js.native
  def version(): MsdVersion = js.native
  def version(newValue: MsdVersion): js.Any = js.native
  def wsdl(): String = js.native
  def wsdl(newValue: String): js.Any = js.native
  def wsdlDescription(): WsdlDescription = js.native
  def wsdlDescription(newValue: WsdlDescription): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd")
@js.native
object Msd extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Msd instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Msd = js.native
  /**
    * Creates and returns a new Msd instance in the SDK and on the server.
    * The new Msd will be automatically stored in the 'msd' property
    * of the parent ConsumedAppService element passed as argument.
    */
  def createIn(container: ConsumedAppService): Msd = js.native
}

