package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XDriverManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore.
  * @deprecated Deprecated
  */
trait XDatabaseEnvironment extends XDriverManager {
  def createDatabaseAccess(URL: String, title: String): XDatabaseAccess
  def getDatabaseAccess(URL: String): XDatabaseAccess
}

object XDatabaseEnvironment {
  @scala.inline
  def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    createDatabaseAccess: (String, String) => XDatabaseAccess,
    getConnection: String => XConnection,
    getConnectionWithInfo: (String, SeqEquiv[PropertyValue]) => XConnection,
    getDatabaseAccess: String => XDatabaseAccess,
    getLoginTimeout: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLoginTimeout: Double => Unit
  ): XDatabaseEnvironment = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout, acquire = js.Any.fromFunction0(acquire), createDatabaseAccess = js.Any.fromFunction2(createDatabaseAccess), getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDatabaseAccess = js.Any.fromFunction1(getDatabaseAccess), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
  
    __obj.asInstanceOf[XDatabaseEnvironment]
  }
}

