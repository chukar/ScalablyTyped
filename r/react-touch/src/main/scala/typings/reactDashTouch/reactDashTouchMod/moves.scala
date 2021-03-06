package typings.reactDashTouch.reactDashTouchMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait moves extends js.Object

@JSImport("react-touch", "moves")
@js.native
object moves extends js.Object {
  @js.native
  sealed trait DOWN extends moves
  
  @js.native
  sealed trait DOWNLEFT extends moves
  
  @js.native
  sealed trait DOWNRIGHT extends moves
  
  @js.native
  sealed trait LEFT extends moves
  
  @js.native
  sealed trait RIGHT extends moves
  
  @js.native
  sealed trait UP extends moves
  
  @js.native
  sealed trait UPLEFT extends moves
  
  @js.native
  sealed trait UPRIGHT extends moves
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[moves with Double] = js.native
  /* 6 */ @js.native
  object DOWN extends TopLevel[DOWN with Double]
  
  /* 7 */ @js.native
  object DOWNLEFT extends TopLevel[DOWNLEFT with Double]
  
  /* 5 */ @js.native
  object DOWNRIGHT extends TopLevel[DOWNRIGHT with Double]
  
  /* 3 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  /* 4 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
  /* 1 */ @js.native
  object UP extends TopLevel[UP with Double]
  
  /* 0 */ @js.native
  object UPLEFT extends TopLevel[UPLEFT with Double]
  
  /* 2 */ @js.native
  object UPRIGHT extends TopLevel[UPRIGHT with Double]
  
}

