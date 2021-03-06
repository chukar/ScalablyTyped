package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectionNs {
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception

  /**
    * allows to accept connection attempts from another process.
    *
    * {@link Acceptor} is a delegating service. You can add further acceptors by giving them a service name com.sun.star.connection.Acceptor.xxx, where xxx
    * is the connection type used in the connection string during {@link accept()} /connect() call.
    */
  type Acceptor = XAcceptor
  /** Is thrown, when there is another thread already accepting on this instance. */
  type AlreadyAcceptingException = Exception
  /** Is thrown, when it is not possible to accept on a local resource. */
  type ConnectionSetupException = Exception
  /**
    * allows to establish a connection to another process.
    *
    * {@link Connector} is a delegating service. You can add further connectors by giving them a service name com.sun.star.connection.Connector.xxx, where
    * xxx is the connection type used in the connection string during accept()/connect() call.
    */
  type Connector = XConnector
  /** Is thrown in case no one is accepting on the specified resource. */
  type NoConnectException = Exception
}
