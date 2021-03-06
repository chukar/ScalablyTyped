package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cell-level metadata.
  */
trait IBaseCellMetadata
  extends JSONObject
     with ICellMetadata {
  /**
    * The Jupyter metadata namespace
    */
  var jupyter: Partial[IBaseCellJupyterMetadata]
  /**
    * The cell's name. If present, must be a non-empty string.
    */
  var name: String
  /**
    * The cell's tags. Tags must be unique, and must not contain commas.
    */
  var tags: js.Array[String]
  /**
    * Whether the cell is trusted.
    *
    * #### Notes
    * This is not strictly part of the nbformat spec, but it is added by
    * the contents manager.
    *
    * See https://jupyter-notebook.readthedocs.io/en/latest/security.html.
    */
  var trusted: Boolean
}

object IBaseCellMetadata {
  @scala.inline
  def apply(jupyter: Partial[IBaseCellJupyterMetadata], name: String, tags: js.Array[String], trusted: Boolean): IBaseCellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBaseCellMetadata]
  }
}

