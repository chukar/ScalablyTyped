package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.createDiffEditor")
@js.native
object createDiffEditor extends js.Object {
  def apply(domElement: HTMLElement): IStandaloneDiffEditor = js.native
  def apply(domElement: HTMLElement, options: IDiffEditorConstructionOptions): IStandaloneDiffEditor = js.native
  def apply(
    domElement: HTMLElement,
    options: IDiffEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneDiffEditor = js.native
}

