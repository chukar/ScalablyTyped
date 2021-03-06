package typings.postmark.postmarkMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.TemplateFilteringParameters")
@js.native
class TemplateFilteringParameters ()
  extends typings.postmark.distClientModelsMod.TemplateFilteringParameters {
  def this(count: Double) = this()
  def this(count: Double, offset: Double) = this()
  def this(
    count: Double,
    offset: Double,
    templateType: typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes
  ) = this()
  def this(
    count: Double,
    offset: Double,
    templateType: typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes,
    layoutTemplate: String
  ) = this()
}

