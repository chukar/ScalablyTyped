package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to store and retrieve URLs. URLs can be stored persistently or until end of OOo session.
  * @since OOo 3.2
  */
trait XUrlContainer extends XInterface {
  /**
    * Add a URL to the container.
    * @param Url URL to add to the container
    * @param MakePersistent indicates whether the URL shall be stored persistently or just in memory (until end of OOo session)
    */
  def addUrl(Url: String, MakePersistent: Boolean): Unit
  /**
    * Lookup a URL in the container.
    * @param Url URL to lookup.
    * @returns Best matched URL or empty string.
    */
  def findUrl(Url: String): String
  /**
    * Get all URLs.
    * @param OnlyPersistent Only URLs that are stored persistently shall be returned.
    * @returns List of URLs.
    */
  def getUrls(OnlyPersistent: Boolean): SafeArray[String]
  /**
    * Remove a URL from the container.
    * @param Url URL to remove.
    */
  def removeUrl(Url: String): Unit
}

object XUrlContainer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addUrl: (String, Boolean) => Unit,
    findUrl: String => String,
    getUrls: Boolean => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeUrl: String => Unit
  ): XUrlContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addUrl = js.Any.fromFunction2(addUrl), findUrl = js.Any.fromFunction1(findUrl), getUrls = js.Any.fromFunction1(getUrls), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeUrl = js.Any.fromFunction1(removeUrl))
  
    __obj.asInstanceOf[XUrlContainer]
  }
}

