package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is an extension to the interface {@link XSimpleFileAccess2} .
  * @since OOo 1.1.2
  */
trait XSimpleFileAccess3 extends XSimpleFileAccess2 {
  /**
    * Checks if a file is "hidden"
    * @param FileURL URL to be checked
    * @returns true, if the given File is "hidden", false otherwise
    */
  def isHidden(FileURL: String): Boolean
  /**
    * Sets the "hidden" of a file according to the boolean parameter, if the actual process has the right to do so and the used operation system supports
    * this operation.
    * @param FileURL URL of the file
    * @param bHidden true; "hidden" flag will be set, false; "hidden" flag will be reset
    */
  def setHidden(FileURL: String, bHidden: Boolean): Unit
}

object XSimpleFileAccess3 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    copy: (String, String) => Unit,
    createFolder: String => Unit,
    exists: String => Boolean,
    getContentType: String => String,
    getDateTimeModified: String => DateTime,
    getFolderContents: (String, Boolean) => SafeArray[String],
    getSize: String => Double,
    isFolder: String => Boolean,
    isHidden: String => Boolean,
    isReadOnly: String => Boolean,
    kill: String => Unit,
    move: (String, String) => Unit,
    openFileRead: String => XInputStream,
    openFileReadWrite: String => XStream,
    openFileWrite: String => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setHidden: (String, Boolean) => Unit,
    setInteractionHandler: XInteractionHandler => Unit,
    setReadOnly: (String, Boolean) => Unit,
    writeFile: (String, XInputStream) => Unit
  ): XSimpleFileAccess3 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copy = js.Any.fromFunction2(copy), createFolder = js.Any.fromFunction1(createFolder), exists = js.Any.fromFunction1(exists), getContentType = js.Any.fromFunction1(getContentType), getDateTimeModified = js.Any.fromFunction1(getDateTimeModified), getFolderContents = js.Any.fromFunction2(getFolderContents), getSize = js.Any.fromFunction1(getSize), isFolder = js.Any.fromFunction1(isFolder), isHidden = js.Any.fromFunction1(isHidden), isReadOnly = js.Any.fromFunction1(isReadOnly), kill = js.Any.fromFunction1(kill), move = js.Any.fromFunction2(move), openFileRead = js.Any.fromFunction1(openFileRead), openFileReadWrite = js.Any.fromFunction1(openFileReadWrite), openFileWrite = js.Any.fromFunction1(openFileWrite), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHidden = js.Any.fromFunction2(setHidden), setInteractionHandler = js.Any.fromFunction1(setInteractionHandler), setReadOnly = js.Any.fromFunction2(setReadOnly), writeFile = js.Any.fromFunction2(writeFile))
  
    __obj.asInstanceOf[XSimpleFileAccess3]
  }
}

