/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.gamekit;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSError;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.annotation.NotImplemented;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKMatchmakerViewControllerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*/implements GKMatchmakerViewControllerDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 4.1 and later.
     */
    @NotImplemented("matchmakerViewControllerWasCancelled:")
    public void wasCancelled(GKMatchmakerViewController viewController) {}
    /**
     * @since Available in iOS 4.1 and later.
     */
    @NotImplemented("matchmakerViewController:didFailWithError:")
    public void didFail(GKMatchmakerViewController viewController, NSError error) {}
    /**
     * @since Available in iOS 4.1 and later.
     */
    @NotImplemented("matchmakerViewController:didFindMatch:")
    public void didFindMatch(GKMatchmakerViewController viewController, GKMatch match) {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("matchmakerViewController:didFindHostedPlayers:")
    public void didFindHostedPlayers(GKMatchmakerViewController viewController, NSArray<GKPlayer> players) {}
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("matchmakerViewController:didFindPlayers:")
    public void didFindPlayers(GKMatchmakerViewController viewController, @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> playerIDs) {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("matchmakerViewController:hostedPlayerDidAccept:")
    public void hostedPlayerDidAccept(GKMatchmakerViewController viewController, GKPlayer player) {}
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("matchmakerViewController:didReceiveAcceptFromHostedPlayer:")
    public void didReceiveAccept(GKMatchmakerViewController viewController, String playerID) {}
    /*</methods>*/
}