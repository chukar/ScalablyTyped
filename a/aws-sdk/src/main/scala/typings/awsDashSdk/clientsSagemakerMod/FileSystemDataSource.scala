package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemDataSource extends js.Object {
  /**
    * The full path to the directory to associate with the channel.
    */
  var DirectoryPath: typings.awsDashSdk.clientsSagemakerMod.DirectoryPath = js.native
  /**
    * The access mode of the mount of the directory associated with the channel. A directory can be mounted either in ro (read-only) or rw (read-write) mode.
    */
  var FileSystemAccessMode: typings.awsDashSdk.clientsSagemakerMod.FileSystemAccessMode = js.native
  /**
    * The file system id.
    */
  var FileSystemId: typings.awsDashSdk.clientsSagemakerMod.FileSystemId = js.native
  /**
    * The file system type. 
    */
  var FileSystemType: typings.awsDashSdk.clientsSagemakerMod.FileSystemType = js.native
}

object FileSystemDataSource {
  @scala.inline
  def apply(
    DirectoryPath: DirectoryPath,
    FileSystemAccessMode: FileSystemAccessMode,
    FileSystemId: FileSystemId,
    FileSystemType: FileSystemType
  ): FileSystemDataSource = {
    val __obj = js.Dynamic.literal(DirectoryPath = DirectoryPath.asInstanceOf[js.Any], FileSystemAccessMode = FileSystemAccessMode.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any], FileSystemType = FileSystemType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSystemDataSource]
  }
}

