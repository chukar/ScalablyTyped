package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a singleton.
  *
  * This type is superseded by {@link XSingletonTypeDescription2} , which supports interface-based singletons, in addition to the obsolete, service-based
  * singletons.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::SINGLETON.
  * @since OOo 1.1.2
  */
trait XSingletonTypeDescription extends XTypeDescription {
  /**
    * Returns the service associated with the singleton.
    * @returns the reflection of the service associated with the singleton, for an obsolete, service-based singleton; for an interface-based singleton, `NULL` i
    */
  val Service: XServiceTypeDescription
  /**
    * Returns the service associated with the singleton.
    * @returns the reflection of the service associated with the singleton, for an obsolete, service-based singleton; for an interface-based singleton, `NULL` i
    */
  def getService(): XServiceTypeDescription
}

object XSingletonTypeDescription {
  @scala.inline
  def apply(
    Name: String,
    Service: XServiceTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getName: () => String,
    getService: () => XServiceTypeDescription,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSingletonTypeDescription = {
    val __obj = js.Dynamic.literal(Name = Name, Service = Service, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getService = js.Any.fromFunction0(getService), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSingletonTypeDescription]
  }
}

