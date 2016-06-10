package com.vladsch.flexmark.html.renderer;

import com.vladsch.flexmark.node.Node;

import java.util.Set;

/**
 * A renderer for a set of node types.
 */
public interface PhasedNodeRenderer extends NodeRenderer {

    Set<RenderingPhase> getRenderingPhases();

    /**
     * Render the specified node.
     *
     * @param node the node to render, will be an instance of one of {@link #getNodeTypes()}
     */
    void render(Node node, RenderingPhase phase);
}
