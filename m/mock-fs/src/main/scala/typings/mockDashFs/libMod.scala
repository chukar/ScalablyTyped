package typings.mockDashFs

import typings.mockDashFs.libDirectoryMod.^
import typings.mockDashFs.libFilesystemMod.DirectoryItems
import typings.mockDashFs.libFilesystemMod.DirectoryOptions
import typings.mockDashFs.libFilesystemMod.FileOptions
import typings.mockDashFs.libFilesystemMod.Options
import typings.mockDashFs.libFilesystemMod.SymlinkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-fs/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  /**
    * Swap out the fs bindings for a mock file system.
    *
    * _Note:_ Import this file _before_ any other modules that import the `fs`
    * module.
    *
    * @param config Mock file system configuration.
    * @param options Any filesystem options.
    * @param options.createCwd Create a directory for `process.cwd()` (defaults to
    *                          `true`).
    * @param options.createTmp Create a directory for `os.tmpdir()` (defaults to
    *                          `true`).
    */
  def apply(): Unit = js.native
  def apply(config: DirectoryItems): Unit = js.native
  def apply(config: DirectoryItems, options: Options): Unit = js.native
  /**
    * Create a directory factory.
    */
  def directory(): js.Function0[^] = js.native
  def directory(config: DirectoryOptions): js.Function0[^] = js.native
  /**
    * Create a file factory.
    */
  def file(): js.Function0[typings.mockDashFs.libFileMod.^] = js.native
  def file(config: FileOptions): js.Function0[typings.mockDashFs.libFileMod.^] = js.native
  /**
    * Get hold of the mocked filesystem's 'root'
    * If fs hasn't currently been replaced, this will return an empty object
    */
  def getMockRoot(): ^  | js.Object = js.native
  /**
    * Restore the fs bindings for the real file system.
    */
  def restore(): Unit = js.native
  /**
    * Create a symbolic link factory.
    */
  def symlink(config: SymlinkOptions): js.Function0[typings.mockDashFs.libSymlinkMod.^] = js.native
}

