package typings.webpack

import typings.webpack.webpackMod.compilation.NormalModuleFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NormalModuleFactory extends js.Object {
  var normalModuleFactory: NormalModuleFactory
}

object Anon_NormalModuleFactory {
  @scala.inline
  def apply(normalModuleFactory: NormalModuleFactory): Anon_NormalModuleFactory = {
    val __obj = js.Dynamic.literal(normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NormalModuleFactory]
  }
}

