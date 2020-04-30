/*
 *   Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License").
 *   You may not use this file except in compliance with the License.
 *   A copy of the License is located at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file. This file is distributed
 *   on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *   express or implied. See the License for the specific language governing
 *   permissions and limitations under the License.
 */

package com.amazon.opendistroforelasticsearch.sql.planner.logical;

import com.amazon.opendistroforelasticsearch.sql.planner.PlanNode;
import com.amazon.opendistroforelasticsearch.sql.planner.PlanNodeVisitor;

/**
 * The abstract base class for all the Logical Plan node.
 */
public abstract class LogicalPlan implements PlanNode<LogicalPlan> {

    @Override
    public <R, C> R accept(PlanNodeVisitor<R, C> visitor, C context) {
        return accept((AbstractPlanNodeVisitor<R, C>) visitor, context);
    }

    public abstract <R, C> R accept(AbstractPlanNodeVisitor<R, C> visitor, C context);

}
