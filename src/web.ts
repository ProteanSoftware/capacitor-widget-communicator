import { WebPlugin } from '@capacitor/core';
import { WidgetCommunicatorPlugin } from './definitions';

export class WidgetCommunicatorWeb extends WebPlugin implements WidgetCommunicatorPlugin {
  constructor() {
    super({
      name: 'WidgetCommunicator',
      platforms: ['web'],
    });
  }

  async updateWidgetData(): Promise<void> {
    throw new Error("Not supported on web right now");
  }
}

const WidgetCommunicator = new WidgetCommunicatorWeb();

export { WidgetCommunicator };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(WidgetCommunicator);
