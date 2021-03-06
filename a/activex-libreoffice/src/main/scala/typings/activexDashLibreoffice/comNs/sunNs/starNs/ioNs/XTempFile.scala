package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface offers access to temp files. */
trait XTempFile
  extends XStream
     with XSeekable {
  /** This attribute controls whether the file will be automatically removed on object destruction. */
  var RemoveFile: Boolean
  /** This attribute specifies the temp file name. */
  var ResourceName: String
  /** This attribute specifies the URL of the temp file. */
  var Uri: String
}

object XTempFile {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    Length: Double,
    OutputStream: XOutputStream,
    Position: Double,
    RemoveFile: Boolean,
    ResourceName: String,
    Uri: String,
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    getLength: () => Double,
    getOutputStream: () => XOutputStream,
    getPosition: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    seek: Double => Unit
  ): XTempFile = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, Length = Length, OutputStream = OutputStream, Position = Position, RemoveFile = RemoveFile, ResourceName = ResourceName, Uri = Uri, acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), getLength = js.Any.fromFunction0(getLength), getOutputStream = js.Any.fromFunction0(getOutputStream), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), seek = js.Any.fromFunction1(seek))
  
    __obj.asInstanceOf[XTempFile]
  }
}

