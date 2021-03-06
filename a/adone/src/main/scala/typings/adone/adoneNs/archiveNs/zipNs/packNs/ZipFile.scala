package typings.adone.adoneNs.archiveNs.zipNs.packNs

import typings.adone.Anon_Compress
import typings.adone.Anon_CompressForceZip64Format
import typings.adone.Anon_ForceZip64Format
import typings.adone.Anon_Mode
import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.archive.zip.pack.ZipFile")
@js.native
class ZipFile () extends js.Object {
  /**
    * A readable stream that will produce the contents of the zip file
    */
  var outputStream: Readable = js.native
  /**
    * Adds a file to the zip file whose content is buffer
    *
    * @param buffer the file's contents, must be at most 0x3fffffff bytes long
    * @param metadataPath path to the file inside the archive
    */
  def addBuffer(buffer: Buffer, metadataPath: String): this.type = js.native
  def addBuffer(buffer: Buffer, metadataPath: String, options: Anon_Compress): this.type = js.native
  /**
    * Adds an entry to the zip file that indicates a directory should be created,
    * even if no other items in the zip file are contained in the directory
    */
  def addEmptyDirectory(metadataPath: String): this.type = js.native
  def addEmptyDirectory(metadataPath: String, options: Anon_Mode): this.type = js.native
  /**
    * Adds a file from the file system at realPath into the zipfile as metadataPath
    *
    * @param path path to the file
    * @param metadataPath path to the file inside the archive
    */
  def addFile(path: String, metadataPath: String): this.type = js.native
  def addFile(path: String, metadataPath: String, options: Anon_Compress): this.type = js.native
  /**
    * Adds a file to the zip file whose content is read from readStream
    *
    * @param stream a readable stream for the file
    * @param metadataPath path to the file inside the archive
    */
  def addReadStream(stream: Readable, metadataPath: String): this.type = js.native
  def addReadStream(stream: Readable, metadataPath: String, options: Anon_CompressForceZip64Format): this.type = js.native
  /**
    * Indicates that no more files will be added via addFile(), addReadStream(), or addBuffer().
    * Some time after calling this function, outputStream will be ended.
    *
    * @returns the final guessed size of the file, can be -1 if it is hard to guess before processing. This will happend
    *      only if compression is enabled, or a stream with no size hint given
    */
  def end(): js.Promise[Double] = js.native
  def end(options: Anon_ForceZip64Format): js.Promise[Double] = js.native
}

