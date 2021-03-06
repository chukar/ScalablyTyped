package typings.reactDashMonacoDashEditor

import org.scalablytyped.runtime.Instantiable0
import typings.monacoDashEditor.Anon_AuthorityFragment
import typings.monacoDashEditor.monacoDashEditorMod.Uri
import typings.monacoDashEditor.monacoDashEditorMod.UriComponents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassUri extends Instantiable0[Uri] {
  /**
    * Creates a new Uri from a file system path, e.g. `c:\my\files`,
    * `/usr/home`, or `\\server\share\some\path`.
    *
    * The *difference* between `Uri#parse` and `Uri#file` is that the latter treats the argument
    * as path, not as stringified-uri. E.g. `Uri.file(path)` is **not the same as**
    * `Uri.parse('file://' + path)` because the path might contain characters that are
    * interpreted (# and ?). See the following sample:
    * ```ts
    const good = Uri.file('/coding/c#/project1');
    good.scheme === 'file';
    good.path === '/coding/c#/project1';
    good.fragment === '';
    const bad = Uri.parse('file://' + '/coding/c#/project1');
    bad.scheme === 'file';
    bad.path === '/coding/c'; // path is now broken
    bad.fragment === '/project1';
    ```
    *
    * @param path A file system path (see `Uri#fsPath`)
    */
  def file(path: String): Uri = js.native
  def from(components: Anon_AuthorityFragment): Uri = js.native
  def isUri(thing: js.Any): /* is monaco-editor.monaco-editor.Uri */ Boolean = js.native
  /**
    * Creates a new Uri from a string, e.g. `http://www.msft.com/some/path`,
    * `file:///usr/home`, or `scheme:with/path`.
    *
    * @param value A string which represents an Uri (see `Uri#toString`).
    */
  def parse(value: String): Uri = js.native
  def parse(value: String, _strict: Boolean): Uri = js.native
  def revive(): js.UndefOr[Uri] = js.native
  def revive(data: Uri): js.UndefOr[Uri] = js.native
  def revive(data: UriComponents): js.UndefOr[Uri] = js.native
  @JSName("revive")
  def revive_Uri(data: Uri): Uri = js.native
  @JSName("revive")
  def revive_Uri(data: UriComponents): Uri = js.native
}

