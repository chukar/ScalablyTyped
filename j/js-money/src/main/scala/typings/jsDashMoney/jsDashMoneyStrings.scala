package typings.jsDashMoney

import typings.jsDashMoney.jsDashMoneyMod.Rounders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsDashMoneyStrings {
  @js.native
  sealed trait ceil extends Rounders
  
  @js.native
  sealed trait floor extends Rounders
  
  @js.native
  sealed trait round extends Rounders
  
  @scala.inline
  def ceil: ceil = "ceil".asInstanceOf[ceil]
  @scala.inline
  def floor: floor = "floor".asInstanceOf[floor]
  @scala.inline
  def round: round = "round".asInstanceOf[round]
}

